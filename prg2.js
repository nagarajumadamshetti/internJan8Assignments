const path = require("path")
const fs = require("fs")
 
const directoryPath = path.join(__dirname, "files")
 
fs.readdir(directoryPath, function(err, files) {
  if (err) {
    console.log("Error getting directory information.")
  } else {
    files.forEach(function(file) {
      fs.stat(directoryPath + `\\${file}`, function(err, stats) {
        console.log(stats)
      })
    })
  }
})