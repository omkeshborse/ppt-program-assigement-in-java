// Function to fetch product data from the API
async function fetchProducts() {
  try {
    const response = await fetch("https://fakestoreapi.com/products");
    const products = await response.json();
    return products;
  } catch (error) {
    console.error("Error fetching products:", error);
    return [];
  }
}

// Function to create product cards and display them on the website
function displayProducts(products) {
  const mainElement = document.getElementById("main");

  products.forEach((product) => {
    const productCard = document.createElement("div");
    productCard.classList.add("product-card");

    const productImage = document.createElement("img");
    productImage.src = product.image;
    productCard.appendChild(productImage);

    const productName = document.createElement("div");
    productName.classList.add("product-name");
    productName.textContent = product.title;
    productCard.appendChild(productName);

    const productPrice = document.createElement("div");
    productPrice.classList.add("product-price");
    productPrice.textContent = `$${product.price}`;
    productCard.appendChild(productPrice);

    const addToCartButton = document.createElement("button");
    addToCartButton.classList.add("add-to-cart");
    addToCartButton.textContent = "Add to Cart";
    addToCartButton.addEventListener("click", () => addToCart(product));
    productCard.appendChild(addToCartButton);

    mainElement.appendChild(productCard);
  });
}

// Function to handle the 'Add to Cart' functionality
function addToCart(product) {
  const cartItems = JSON.parse(localStorage.getItem("cartItems")) || [];
  const existingItem = cartItems.find((item) => item.id === product.id);

  if (existingItem) {
    existingItem.quantity += 1;
  } else {
    cartItems.push({ ...product, quantity: 1 });
  }

  localStorage.setItem("cartItems", JSON.stringify(cartItems));
}

// Function to display the Cart UI
function displayCart() {
  const cartModal = document.getElementById("cartModal");
  const modalContent = cartModal.querySelector(".modal-content");
  modalContent.innerHTML = "";

  const cartItems = JSON.parse(localStorage.getItem("cartItems")) || [];

  if (cartItems.length === 0) {
    modalContent.textContent = "Your cart is empty.";
  } else {
    cartItems.forEach((item) => {
      const cartItemCard = document.createElement("div");
      cartItemCard.classList.add("product-card");

      const cartItemImage = document.createElement("img");
      cartItemImage.src = item.image;
      cartItemCard.appendChild(cartItemImage);

      const cartItemName = document.createElement("div");
      cartItemName.classList.add("product-name");
      cartItemName.textContent = item.title;
      cartItemCard.appendChild(cartItemName);

      const cartItemPrice = document.createElement("div");
      cartItemPrice.classList.add("product-price");
      cartItemPrice.textContent = `$${item.price}`;
      cartItemCard.appendChild(cartItemPrice);

      const cartItemQuantity = document.createElement("div");
      cartItemQuantity.textContent = `Quantity: ${item.quantity}`;
      cartItemCard.appendChild(cartItemQuantity);

      modalContent.appendChild(cartItemCard);
    });
  }

  cartModal.style.display = "block";
}

// Close the Cart UI when the user clicks on the close button
document.querySelector(".close").addEventListener("click", () => {
  const cartModal = document.getElementById("cartModal");
  cartModal.style.display = "none";
});

// Fetch products and display them on the website when the page loads
window.addEventListener("load", async () => {
  const products = await fetchProducts();
  displayProducts(products);
});
// <!-- Add this script after the existing script.js -->

  // Function to create the single product page
  function displaySingleProduct(product) {
    const mainElement = document.getElementById('main');
    mainElement.innerHTML = '';

    const singleProductCard = document.createElement('div');
    singleProductCard.classList.add('product-card');

    const productImage = document.createElement('img');
    productImage.src = product.image;
    singleProductCard.appendChild(productImage);

    const productName = document.createElement('div');
    productName.classList.add('product-name');
    productName.textContent = product.title;
    singleProductCard.appendChild(productName);

    const productPrice = document.createElement('div');
    productPrice.classList.add('product-price');
    productPrice.textContent = `$${product.price}`;
    singleProductCard.appendChild(productPrice);

    mainElement.appendChild(singleProductCard);
  }

  //
