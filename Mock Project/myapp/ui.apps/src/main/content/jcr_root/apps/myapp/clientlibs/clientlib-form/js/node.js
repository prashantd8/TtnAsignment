$(document).ready(function(){
          $("button").click(function(){
            $.ajax({
                    url: '/bin/submitdata2',
                    method: 'POST',
                    data: {},
                    cache: false,
                    mimeType: 'text/html',
                    success: function (data) {
                        alert("OK");
                    },
                    error: function (xhr, status, err) {
                         alert("error occured");
                    }
                });
          });
        });