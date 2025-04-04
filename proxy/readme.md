
---

## 🔹 Proxy Pattern – Image Management System

### 🗺 Scenario

Real estate agents upload **high-resolution images** of properties.  
Users visiting the website should see **low-res thumbnails**, and only load **full-resolution images** on demand (e.g., zoom or click).  
🔒 Only logged-in agents should be allowed to upload or replace images.

### 🛠 Problem Solved

Without a proxy, every image (including full-size) would load by default, creating delays and performance issues.  
We also need to restrict image upload access to authorized users.

### ✅ How Proxy Simplified the Design

- Used **virtual proxy** for **lazy loading** of full images (`displayFullImage()`).
- Used **protection proxy** to restrict upload access via `User.isAgent()` check.

### 💡 Outcome

- Thumbnails load instantly.
- Full-resolution images are loaded only when needed.
- Agent permissions are enforced separately from image logic.
