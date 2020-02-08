var training = training || {};

training.customer = {
		
	validateSaveoptions: function(){
	    console.log('Hello');
		$(document).on("click",".js-profileFormUpdateButton",function(e){
			e.preventDefault();

			if (ACC.config.saveUsingAjax) {
				console.log("Using Ajax");
				$.ajax({
					url: ACC.config.encodedContextPath + "/update-profile",
					data: $('#updateProfileForm').serialize(),
					type: "POST",
					success: function(data)
					{
						alert("Form Saved with Sucess");
					},
					error: function(xht, textStatus, ex)
					{
						alert("Something was wrong");
					}
				});
			} else {
				$("#updateProfileForm").submit();
			}
		});
	}
}

$(document).ready(function () {
	training.customer.validateSaveoptions();
});