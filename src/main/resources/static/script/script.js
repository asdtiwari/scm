$(document).ready(function () {
    
    let currentTheme = getTheme();

    // Apply the theme on page load
    changeTheme();

    function changeTheme() {
        changePageTheme(currentTheme);

        const $button = $("#changeThemeButton");

        // Add click event listener to toggle the theme
        $button.on("click", function () {
            const oldTheme = currentTheme;

            // Toggle theme
            currentTheme = currentTheme === "dark" ? "light" : "dark";

            // Update the theme on the page
            changePageTheme(oldTheme);
        });
    }

    function setTheme(theme) {
        localStorage.setItem("theme", theme);
    }

    function getTheme() {
        let theme = localStorage.getItem("theme");
        return theme ? theme : "light"; // Default to "light" if no theme is set
    }

    function changePageTheme(oldTheme) {
        const $html = $("html");

        // Remove the old theme class
        if (oldTheme) {
            $html.removeClass(oldTheme);
        }

        // Add the new theme class
        $html.addClass(currentTheme);

        // Save the current theme to localStorage
        setTheme(currentTheme);

        // Update the button text to reflect the new theme
        const newText = currentTheme === "light" ? "Dark" : "Light";
        $("#changeThemeButton span").text(newText);
    }
});
