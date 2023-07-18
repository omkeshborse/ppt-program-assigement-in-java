// Get the form elements
const nameInput = document.getElementById("name");
const emailInput = document.getElementById("email");
const messageInput = document.getElementById("message");

// Get the preview elements
const previewName = document.getElementById("previewName");
const previewEmail = document.getElementById("previewEmail");
const previewMessage = document.getElementById("previewMessage");

// Update the live preview
function updatePreview() {
  previewName.textContent = nameInput.value || "Your Name";
  previewEmail.textContent = emailInput.value || "Your Email";
  previewMessage.textContent = messageInput.value || "Your Message";
}

// Add event listeners to form inputs
nameInput.addEventListener("input", updatePreview);
emailInput.addEventListener("input", updatePreview);
messageInput.addEventListener("input", updatePreview);
