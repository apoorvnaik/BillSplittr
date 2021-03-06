<!DOCTYPE html>
<html>
	<head>
		<title>Maxmertkit</title>
		<link rel="stylesheet" type="text/css" href="css/reset.css">
		<link rel="stylesheet" type="text/css" href="css/maxmertkit.css">
		<link rel="stylesheet" type="text/css" href="css/maxmertkit-components.css">
		<link rel="stylesheet" type="text/css" href="css/maxmertkit-animation.css">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<script type="text/javascript" src="js/libs/html5shiv.js"></script>
		<script type="text/javascript" src="js/libs/jquery.js"></script>
		<script type="text/javascript" src="js/libs/easing.js"></script>
		<script type="text/javascript" src="js/libs/imagesLoaded.js"></script>
		<script type="text/javascript" src="js/libs/modernizr.js"></script>

		<script type="text/javascript" src="js/plugins/maxmertkit.js"></script>
		<script type="text/javascript" src="js/plugins/maxmertkit.affix.js"></script>
		<script type="text/javascript" src="js/plugins/maxmertkit.scrollspy.js"></script>
		<script type="text/javascript" src="js/plugins/maxmertkit.popup.js"></script>
		<script type="text/javascript" src="js/plugins/maxmertkit.tabs.js"></script>
		<script type="text/javascript" src="js/plugins/maxmertkit.modal.js"></script>
		<script type="text/javascript" src="js/plugins/maxmertkit.carousel.js"></script>
		<script type="text/javascript" src="js/plugins/maxmertkit.button.js"></script>
		<script type="text/javascript" src="js/plugins/maxmertkit.notify.js"></script>

		<script type="text/javascript">
			(function($){
				$(document).ready(function(){
					$('.js-tooltip').popup({
						trigger: 'click',
						animation: 'easeOutElastic',
						animationDuration: 400,
						template: '<div class="-tooltip"><i class="-arrow"></i><div class="js-content"></div></div>',
						placement: 'top'
					});
					
					$('.js-tooltip2').popup({
						content: 'tooltip2', 
						animation: 'rotateIn', 
						animationDuration: 500,
						onlyOne: true,

						beforeOpen: function() {
							$(this).addClass('_loading_ _active_');
							
							var d = $.Deferred();
							setTimeout(function(){ d.resolve() },1000);
							return d.promise();
						},
						open: function() {
							$(this).addClass('_active_')
						},
						ifNotOpened: function() {
							
						},
						ifOpenedOrNot: function() {
							$(this).removeClass('_loading_')
						},
						beforeClose: function() {
							$(this).addClass('_loading_');
							var d = $.Deferred();
							setTimeout(function(){ d.resolve() },1000);
							return d.promise();
						},
						close: function() {
							$(this).removeClass('_active_')
						},
						ifClosedOrNot: function() {
							$(this).removeClass('_loading_');
						}
					});

					$('.js-dropdown').popup({
						template: '.dropdown-template',
						trigger: 'click',
						placement: 'bottom',
						animation: 'growUp',
						theme: 'primary',
						onlyOne: true,
						open: function() {
							$(this).addClass('_active_')
						},
						close: function() {
							$(this).removeClass('_active_')
						}
					});


					$('.js-tabs').tabs({
						itemsSelector: 'li',
						animation: true
					});

					$('.js-modal').modal({
						animation: 'dropIn',
						theme: 'error',
						beforeClose: function() {
							if( $('.js-dropdown4').data('kit-popup').state === 'opened' )
								$('.js-dropdown4').click();
						}
					});

					$('.js-modal-show').on('click', function() {
						$('.js-modal').data('kit-modal').open();
					});

					$('.js-affix').affix();

					$('.js-scrollspy').scrollspy();

					$('#js-carousel').carousel({theme: 'info'});

					

					$('[data-radio="radio1"]').button({
						
						action: function() {
							console.log('action')
							$(this).addClass('_active_')
						},

						unsetted: function() {
							console.log('unsetted')
							$(this).removeClass('_active_')
						},

						beforeAction: function() {
							$(this).addClass('_loading_ _active_');
							
							var d = $.Deferred();
							setTimeout(function(){ d.resolve() },1000);
							return d.promise();
						},
						
						ifNotAction: function() {
							
						},
						clicked: function() {
							$(this).removeClass('_loading_')
						},
						beforeUnset: function() {
							$(this).addClass('_loading_');
							var d = $.Deferred();
							setTimeout(function(){ d.resolve() },1000);
							return d.promise();
						},
						unsetted: function() {
							$(this).removeClass('_active_')
						},
						ifUnsettedOrNot: function() {
							$(this).removeClass('_loading_');
						}
						
					
					});

					$('[data-checkbox], .js-button1').button({
						
						action: function() {

							$(this).addClass('_active_');
							$.notify(
								"Example of how can button get data, change statuses, and how $.notify works"
								, {
									header: 'Approved',
									theme: 'primary'
								});

						},

						unsetted: function() {
							$(this).removeClass('_active_')
						},

						beforeAction: function() {
							$(this).addClass('_loading_ _active_');
							
							var d = $.Deferred();
							setTimeout(function(){ d.resolve() },1000);
							return d.promise();
						},
						
						ifNotAction: function() {
							
						},
						clicked: function() {
							$(this).removeClass('_loading_')
						},
						beforeUnset: function() {
							$(this).addClass('_loading_');
							var d = $.Deferred();
							setTimeout(function(){ d.resolve() },1000);
							return d.promise();
						},
						unsetted: function() {
							$(this).removeClass('_active_')
						},
						ifUnsettedOrNot: function() {
							$(this).removeClass('_loading_');
						}
						
					
					});

				});
			})(jQuery);
		</script>

		<script type="javascript/template" class="dropdown-template">
			<div class="-dropdown">
				<i class="-arrow"></i>
				<ul class="-menu -primary-">
					<li><a><i class="-icon-thumbs-up"></i> I like it</a></li>
					<li><a><i class="-icon-star"></i> Favourite</a></li>
					<li><a><i class="-icon-thumbs-down"></i> I hate it</a></li>
					<li class="-menu-sub"><a><i class="-icon"></i> Share</a>
						<div class="-dropdown">
							<ul class="-menu">
								<li><a><i class="-icon"></i> Facebook</a></li>
								<li class="-success-"><a><i class="-icon-ok-circle"></i> Twitter</a></li>
								<li><a><i class="-icon"></i> My space</a></li>
							</ul>
						</div>
					</li>
					<li class="-menu-separator"></li>
					<li class="-error-"><a><i class="-icon-remove"></i> Dont show me this</a></li>
				</ul>
			</div>
		</script>
	</head>
	<body class="_responsive_">
		<div class="-container">
                    <div id="header" class="-row-fluid">
                        <div class="-col10 -col-offset1">
                            <div id="logo">
                                <img src=""/>
                            </div>
                            <div id="header-links" class="-col5 -col-offset4">
                                <ul>
                                    <li>Home</li>
                                    <li>About Us</li>
                                    <li>Contact Us</li>
                                    <li>FAQs</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div id="content" class="-row-fluid"></div>
                    <div id="footer" class="-row-fluid"></div>
                </div>
        </body>
</html>