var fs = require('fs');
var path = require('path');
//REQUIREMENTS
// 1. Pass the directory name using command line argument
// 2. Access the input directory in such a way that it should read all the files and subdirectories in it but with a condition that it should not exceed 10 contents .
// 3. If the accessed one is a sub directory repeat the accessing process as in step2
// 4. the output should be in the following manner
// mainDir
//      SubDir1
//              file11
//              file12
//              file13
//              ...others(if there are more than 10 contents)
//      subDir2
//              file21
//              file22
//      file1
//      file2
//      ...others(if there are more than 10 contents)

// Return a list of files in the provided dir, 
// with the file path relative to the given dir
// dir: path of the directory you want to search the files for
function getFilesFromDir(dir) {
  let s = 0;
  //creating an array to store the files and directories
  var filesToReturn = [];
  function walkDir(currentPath, s) {
    //the filenames will be returned
    var files = fs.readdirSync(currentPath);
    let spaces = "";
    //adding the spaces to attain the required pattern.
    for (let j = 0; j < s; j++) {
      spaces = spaces + " ";
    }
    for (var i in files) {
      if (i < 4) {
        //adding the file to the path to check if it is file or directory
        var curFile = path.join(currentPath, files[i]);
        if (fs.statSync(curFile).isFile()) {
          //if file add the file name to the array
          filesToReturn.push(spaces + files[i]);
        } else if (fs.statSync(curFile).isDirectory()) {
          // if it is a directory add the directory name to the array
          filesToReturn.push("->" + spaces + files[i]);
          //calling the walkDir to read the contents present in the current directory.
          walkDir(curFile, s + 4);
        }
      }
      else {
        filesToReturn.push(spaces + "...Other files and directories")
        break;
      }
    }
  };
  //invoking the walkDir to read the contents.
  walkDir(dir, s);
  // displaying the contents as specified. 
  for (var i in filesToReturn) {
    console.log(filesToReturn[i]);
  }
}
//invoking the main function.
getFilesFromDir("D:\\cse4-1");