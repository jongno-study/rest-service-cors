$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/greeting"
    }).then(function(data, status, jqxhr) {
        $('.greeting-id').append(data.id);
        $('.greeting-content').append(data.content);
        console.log(jqxhr);
    });
				
				$.ajax({
								url: "http://localhost:8080/hello"
				}).then(function(data, status, jqxhr) {
        $('.hello').append(data);
								console.log(jqxhr);
				});
});