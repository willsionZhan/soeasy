'use strict';

var exec = function() {

  //function handleScroll() {
  //  document.querySelector('.js-scroll-top').hidden = window.pageYOffset < 100;
  //}

  //window.onscroll = handleScroll;

  //handleScroll();

  // NOTE: Dropdown fix
  /*
  $('a[tabindex][data-toggle="dropdown"]').on('keydown', function(event) {
    // 13: Return, 32: Spacebar

    if (![13, 32].includes(event.keyCode)) {
      return;
    }

    // NOTE: Off vertical scrolling
    event.preventDefault();

    $(this).dropdown('toggle');
  });

  $('.dropdown-menu').on('click', function(event) {
    if (this === event.target) {
      event.stopPropagation();
    }
  });
*/
  $('[data-submenu]').submenupicker();
};

if (document.readyState === 'loading') {
  document.addEventListener('DOMContentLoaded', exec);
} else {
  exec();
}
