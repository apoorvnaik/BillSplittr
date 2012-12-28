var img = new Image();
img.src = 'images/followme-over.png';

$(window).load(function() {
    var progressBarWrap = $('#progress-bar-wrap');
    var progressAmount = $('#progress-amount');    
    var targetWidth = $('#progress-wrap').width() * (progress / 100);
    progressBarWrap.animate({
        width: targetWidth
    }, animationSpeed, null, function() {
		$('#moving-arrow').animate({height: '35'}, 'slow', 'easeOutBack', function() {
			progressAmount.text(progress + '%').fadeIn('slow');													   
		});		
    }).css('overflow', 'visible');
	$('#progress-indicator').fadeIn('slow');
});
