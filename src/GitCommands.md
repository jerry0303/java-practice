Git hub

Git —version

git config --global user.name "jerry0303"

git config --global user.email “vaibhav24.sharma@gmail.com”

git config --list

git clone https://github.com/jerry0303/java-practice

ls -a  [list  all]

git status

+++++++++++++++++++++++++++++++++
stages

untracked
modified
staged
modified

+++++++++++++++++++++++++++++++++

git add . for all files


commit  >

git commit -m "Ds"

git commit -m "leftRotationForArray"

push>

git push origin main


Init Command  >

git init
git remote add origin https://github.com/jerry0303/java-practice
git remote -v  [to verify remote]
git branch      [to check branch]
git branch -M main  [to rename branch]
git push origin feature-init
git push -u origin feature-init [to set up for next commits]




WorkFlow > Branch commands
git branch              [to check branch]
git branch -M main      [to rename branch]
git checkout <branch name> [to navigate]
git checkout -b <new branch name> [to create new branch]
git branch -d <branch name> [to delete name ]

Merging Code  >
git diff  <branch name>  (to compare commits, branches files, & more)
git merge  <branch name> (to merge 2 branches)
way  2
PR

Pull   >
git pull origin main
See git-pull(1) for details.

    git pull <remote> <branch>
    git pull https://github.com/jerry0303/java-practice feature-init

If you wish to set tracking information for this branch you can do so with:

    git branch --set-upstream-to=origin/<branchname> feature-init
    git branch --set-upstream-to=origin/feature-init
    Branch 'feature-init' set up to track remote branch 'feature-init' from 'origin'.


Undoing Changes  >

Case1:
git reset <file name>
git reset

Case2:  Commited Changes [for one commit]
git reset HEAD~1

Case3 :  Commited Changes [for many commit]
git reset  <-commit hash>
git reset --hard <-commit hash>






echo "# Test2" >> README.md
git init
git add README.md
git commit -m "DsPractice"
git branch -M main
git remote add origin https://github.com/jerry0303/java-practice
git push -u origin main

git remote add origin https://github.com/jerry0303/java-practice
git branch -M main
git push -u origin main




Error
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.

git push -f origin master
With the -f tag you will override the remote branch code with your local repo code.





git branch --set-upstream-to=<remote_name>/<remote_branch> <local_branch>

git push -u feature-java feature-java

git branch --set-upstream-to=feature-java feature-java


git branch --set-upstream-to=feature-java feature-java

#workedgit remote

git branch --set-upstream-to=origin/feature-java feature-java


git push origin feature-dsps


git rm --cached Opulent/ComplierProgramming/Multithreading/core-java


git submodule add  Opulent/ComplierProgramming/Multithreading/core-java


git rm --cached -f Opulent/ComplierProgramming/Multithreading/core-java
