# 🎓 VeriCred Campus

A privacy-preserving digital academic credential platform built using the MOSIP Inji ecosystem.

## 📌 Project Overview

VeriCred Campus enables educational institutions to issue secure, verifiable digital credentials (such as Student IDs, Degree Certificates, and Transcripts) using the OpenID4VCI standard.

Students can securely store their credentials in a digital wallet and share them with employers or universities for instant verification.

---

## 🚀 Tech Stack

### Backend
- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database

### Frontend
- React

### Identity & Verifiable Credentials
- MOSIP Inji Certify
- MOSIP Inji Verify
- MOSIP Inji Web Wallet
- OpenID4VCI
- OpenID4VP

### DevOps
- Docker
- Docker Compose
- Git & GitHub

---

## 📂 Project Structure

```
vericred-campus/
│
├── backend/            # Spring Boot backend
├── credentials/        # Credential schemas
├── wallet-config/      # Wallet configuration
├── verify-config/      # Verify configuration
├── dashboard/          # React dashboard
├── docs/               # Documentation
├── inji-certify/       # Local MOSIP repository (ignored)
└── inji-verify/        # Local MOSIP repository (ignored)
```

---

## ✅ Current Progress

### Day 1

- ✅ Project structure created
- ✅ Spring Boot backend initialized
- ✅ Health API implemented
- ✅ Inji Certify sandbox configured
- ✅ Docker environment running
- ✅ OpenID4VCI metadata endpoint verified
- ✅ Inji Verify running
- ✅ Inji Web Wallet running

---

## 🔜 Upcoming Features

- Student Management API
- Course Management
- Grade Management
- Student Credential Issuance
- Degree Credential Issuance
- Transcript Credential
- QR Code Credential Sharing
- Credential Verification
- Revocation Dashboard

---

## 👨‍💻 Author

**Alin Alex**

Built as part of an internship project using the MOSIP Inji ecosystem.
