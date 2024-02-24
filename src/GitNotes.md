**Not getting branches of set url**

If you're not seeing the branches of the new remote repository after changing the URL,
it's likely because Git doesn't automatically fetch branches from the new remote repository. 
You'll need to fetch the branches explicitly to update your local repository 
with the branch information from the new remote.

Here's how you can fetch branches from the new remote repository:

bash
Copy code

**git fetch origin**
Replace origin with the name of your remote repository if it's different.

After fetching the branches, you can list them to verify that they are now available locally:


Copy code
**git branch -r**
This command lists all remote branches. 
If you want to work with a specific remote branch locally, 
you can create and check out a new local branch based on the remote branch:


Copy code
**   git checkout -b local-branch-name origin/remote-branch-name  **
**   git checkout -b feature-dsps origin/feature-dsps  **
Replace local-branch-name with the desired name for your new local branch,
and remote-branch-name with the name of the remote branch you want to work with.

Once you've fetched the branches and created any local branches you need,
you should be able to see and work with the branches from the new remote repository.





git remote set-url origin https://github.com/jerry0303/java-practice

git remote set-url origin https://github.com/jerry0303/java-practice

