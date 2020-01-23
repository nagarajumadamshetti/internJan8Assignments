const fs = require('fs');
var path = "D:\\cse4-1";
read(path);
function read(path) {
    fs.readdir(path, function (err, items) {
        for (var i = 0; i < items.length; i++) {
            var file = path + '\\' + items[i];
            fs.stat(file, generate_callback(file));
        }
    });
}
function generate_callback(file) {
    return function (err, stats) {
        if (stats.isFile()) {
            console.log(file);
        }
        else {
            console.log(file);
            read(path + '\\' + file);
        }
    }
};