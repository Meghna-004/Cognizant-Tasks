console.log("Event Portal Loaded");

//Form submit (contact.html only)
document.addEventListener("DOMContentLoaded", function () {
  const form = document.getElementById("eventForm");

  if (form) {
    // Restore saved preference on load
    const savedEvent = localStorage.getItem("preferredEvent");
    if (savedEvent) {
      const sel = document.getElementById("eventType");
      if (sel) sel.value = savedEvent;
    }

    // Submit → show confirmation via <output>
    form.addEventListener("submit", function (e) {
      e.preventDefault();
      const name = document.getElementById("name").value;
      const eventType = document.getElementById("eventType").value;
      document.getElementById("result").textContent =
        "Thank you " +
        name +
        "! You registered for the " +
        eventType +
        " event.";
    });

    // Track unsaved changes for onbeforeunload
    let formChanged = false;
    form.addEventListener("input", () => {
      formChanged = true;
    });

    window.onbeforeunload = function () {
      if (formChanged) return "You have unsaved changes. Leave anyway?";
    };
  }
});

// Exercise 6: Event Handling 
// 1. onblur — phone validation
function validatePhone() {
  const phone = document.getElementById("phone").value;
  const msg = document.getElementById("phoneMsg");
  if (/^\d{10}$/.test(phone)) {
    msg.textContent = "✔ Valid phone number";
    msg.style.color = "green";
  } else {
    msg.textContent = "✘ Enter a valid 10-digit number";
    msg.style.color = "red";
  }
}

// 2. onchange — show event fee
function showFee() {
  const fee = document.getElementById("eventFee").value;
  document.getElementById("feeDisplay").textContent = fee
    ? "Selected Fee: ₹" + fee
    : "";
}

// 3. onclick — confirm submit
function confirmSubmit() {
  document.getElementById("confirmMsg").textContent =
    "✔ Registration confirmed!";
}

// 4. ondblclick — enlarge image
function enlargeImage() {
  const img = document.getElementById("eventImg");
  img.style.width = img.style.width === "300px" ? "150px" : "300px"; // toggle
}

// 5. onkeyup — character counter
function countChars() {
  const text = document.getElementById("feedback").value;
  document.getElementById("charCount").textContent = text.length;
}

//Exercise 7: Media Events

function videoReady() {
  const el = document.getElementById("videoStatus");
  if (el) el.textContent = "✅ Video ready to play";
}

//Exercise 8: localStorage

function savePreference() {
  const val = document.getElementById("eventType").value;
  if (val) localStorage.setItem("preferredEvent", val);
}

function clearPreferences() {
  localStorage.clear();
  sessionStorage.clear();
  const sel = document.getElementById("eventType");
  if (sel) sel.value = "";
  alert("Preferences cleared.");
}

//Exercise 9: Geolocation

function findNearbyEvents() {
  const output = document.getElementById("geoResult");
  if (!navigator.geolocation) {
    output.textContent = "Geolocation is not supported by your browser.";
    return;
  }
  output.textContent = "Locating…";
  navigator.geolocation.getCurrentPosition(
    function (pos) {
      output.textContent =
        "📍 Your location — Lat: " +
        pos.coords.latitude.toFixed(4) +
        ", Lon: " +
        pos.coords.longitude.toFixed(4) +
        " | Nearest event: City Park (2.3 km away)";
    },
    function (err) {
      switch (err.code) {
        case err.PERMISSION_DENIED:
          output.textContent =
            "⚠ Permission denied. Please allow location access.";
          break;
        case err.POSITION_UNAVAILABLE:
          output.textContent = "⚠ Location unavailable. Try again later.";
          break;
        case err.TIMEOUT:
          output.textContent = "⚠ Request timed out. Check your connection.";
          break;
        default:
          output.textContent = "⚠ An unknown error occurred.";
      }
    },
    { enableHighAccuracy: true, timeout: 8000, maximumAge: 0 }
  );
}
