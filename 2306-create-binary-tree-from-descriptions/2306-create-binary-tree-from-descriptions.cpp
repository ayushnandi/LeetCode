/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
    TreeNode * treebuilder(int nodeVal, unordered_map<int, pair<int, int>> tree){
        TreeNode* root = new TreeNode(nodeVal);
        std::queue<TreeNode*> q;
        q.push(root);

        while (!q.empty()) {
            TreeNode* current = q.front();
            q.pop();

            int leftVal = tree[current->val].first;
            int rightVal = tree[current->val].second;

            if (leftVal != 0) {
                current->left = new TreeNode(leftVal);
                q.push(current->left);
            }

            if (rightVal != 0) {
                current->right = new TreeNode(rightVal);
                q.push(current->right);
            }
        }

        return root;
    }
    TreeNode* createBinaryTree(vector<vector<int>>& descriptions) {
        unordered_map<int, pair<int, int>> tree;
        unordered_map<int, int> topFinder;
        int Root = 0;

        for(int i = 0; i < descriptions.size(); i++){
            topFinder[descriptions[i][0]] = true;
        }

        for(int i = 0; i < descriptions.size(); i++){
            topFinder[descriptions[i][1]] = false;
        }

        for(auto x: topFinder){
            if(x.second == true){
                Root = x.first;
            }
        }

        for(int i = 0; i < descriptions.size(); i++){
            if(descriptions[i][2] == 0){
                tree[descriptions[i][0]].second = descriptions[i][1];
            }else{
                tree[descriptions[i][0]].first = descriptions[i][1];
            }
        }


    return treebuilder(Root, tree);
    }
};