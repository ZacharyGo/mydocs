echo "# mydocs" >> README.md
git init
git add *.*
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/ZacharyGo/mydocs.git
git push -u origin main