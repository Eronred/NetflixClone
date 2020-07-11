## How to Contribute

### Raising an issue:
 This is an Open Source Educational project.
 We would be happy to see contributors who report bugs and file feature requests submitting pull requests as well.
 Please report issues here [Issues - Eronred/NetflixClone](https://github.com/Eronred/NetflixClone/issues)

### Branch Policy

#### Sending pull requests:

Go to the repository on GitHub at https://github.com/Eronred/NetflixClone.

Click the “Fork” button at the top right.

You’ll now have your copy of the original NetflixClone repository in your GitHub account.

Open a terminal/shell.

Type

`$ git clone https://github.com/username/NetflixClone`

where 'username' is your username.

You’ll now have a local copy of your version of the original NetflixClone repository.

#### Change into that project directory (NetflixClone):

`$ cd NetflixClone`

#### Add a connection to the original owner’s repository.

`$ git remote add upstream https://github.com/Eronred/NetflixClone`

#### To check this remote add set up:

`$ git remote -v`

### Make a new branch for your work

In order to make a new branch use:

`git chechout -b <name-of-branch>`

Where, `<name-of-branch>` will your branch name and it should be unique and meaningful.


#### Make changes to files.

`git add` and `git commit` those changes

`git push origin <name-of-branch>` in case it is a new file, else `git push` them back to GitHub. These will go to your version of the repository.

#### Now Create a PR (Pull Request)
Go to your version of the repository on GitHub.

Click the “New pull request” button at the top.

Note that NetflixClone’s repository will be on the left and your repository will be on the right.

Click the green button “Create pull request”. Give a succinct and informative title, in the comment field give a short explanation of the changes and click the green button “Create pull request” again.

#### Pulling others’ changes
Before you make further changes to the repository, you should check that your version is up to date relative to NetflixClone’s version.

Go into the directory for the project and type:

`$ git checkout development`
`$ git pull upstream development --rebase`

This will pull down and merge all of the changes that have been made in the original NetflixClone repository.


### Deleting the branch that is used to make PR
Before we delete any branch checkout to the development branch by following command:

`$ git checkout development`
`$ git branch -D <your-branch-name>`

We need to delete that same branch from remote too. For that either go to your forked repository and click on branches and delete that branch or else write the below command:

`$ git push origin --delete <your-branch-name>`

Then, synchronize your branch list using:

`$ git fetch -p`

The -p flag means "prune". After fetching, branches which no longer exist on the remote will be deleted.
Then again start with making of new branch.