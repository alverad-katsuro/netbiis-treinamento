const burgerIco = document.querySelector('.navbar-burger');
const navbarMenu = document.querySelector('#nav-links');


burgerIco.addEventListener('click', () => {
    navbarMenu.classList.toggle('is-active');
    window.addEventListener('scroll', window.scrollTo(0,0));
});