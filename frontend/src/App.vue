<template>
  <div>
    <nav style="display:flex; gap:12px; padding:12px; border-bottom:1px solid #ddd;">
      <router-link to="/login">Login</router-link>
      <router-link to="/register">Register</router-link>
      <router-link to="/dashboard">Dashboard</router-link>
      <button v-if="isAuthed" @click="logout">Logout</button>
    </nav>
    <router-view />
  </div>
</template>

<script setup>
import { computed } from 'vue'
import { isAuthenticated, logout } from './services/auth.js'
const isAuthed = computed(() => isAuthenticated())
</script>
