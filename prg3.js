const fs = require('fs');
function read(path) {
    console.log("-----------------------------------");
    fs.readdir(path, (err, items) => {
        items.forEach(function (file) {
            console.log("______________________");
            console.log(file);
            fs.stat(path + "\\" + file, (err, stats) => {
                // if(err)
                // {
                //     console.log("error");
                //     return;
                // }
                console.log("-====-==-=-=-=-=-=-=-=-=");
                {
                    console.log("=================================")
                    // console.log(file);
                    if (stats.isDirectory()) {
                        read(path + "\\" + file);
                    }
                }
            })

        })
    })
}
read("D:\\cse3-1\\AINN");