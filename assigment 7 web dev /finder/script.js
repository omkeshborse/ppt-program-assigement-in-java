const searchBtn = document.getElementById("search-btn");
const usernameInput = document.getElementById("username");
const userInfoContainer = document.getElementById("user-info");
const avatarElement = document.getElementById("avatar");
const nameElement = document.getElementById("name");

searchBtn.addEventListener("click", () => {
  const username = usernameInput.value.trim();
  if (username === "") {
    return;
  }

  const apiUrl = `https://api.github.com/users/${username}`;

  fetch(apiUrl)
    .then((response) => response.json())
    .then((userData) => {
      if (userData.message === "Not Found") {
        showUserInfo(null);
      } else {
        showUserInfo(userData);
      }
    })
    .catch((error) => {
      console.error("Error fetching data:", error);
      showUserInfo(null);
    });
});

function showUserInfo(userData) {
  if (userData) {
    avatarElement.src = userData.avatar_url;
    nameElement.textContent = userData.name || "Name not available";
  } else {
    avatarElement.src = ""; // Clear the image if user not found
    nameElement.textContent = "User not found";
  }

  userInfoContainer.style.display = "block";
}
