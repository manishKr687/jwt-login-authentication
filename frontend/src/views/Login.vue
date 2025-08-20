<template>
  <div style="max-width:400px; margin:40px auto;">
    <h2>Login</h2>
    <form @submit.prevent="submit">
      <div>
        <label>Email</label>
        <input v-model="email" type="email" required />
      </div>
      <div>
        <label>Password</label>
        <input v-model="password" type="password" required />
      </div>
      <button type="submit">Login</button>
      <p v-if="error" style="color:red">{{ error }}</p>
    </form>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import api from '../services/api.js'
import { saveToken } from '../services/auth.js'

const email = ref('')
const password = ref('')
const error = ref('')

async function submit() {
  error.value = ''
  try {
    const { data } = await api.post('/auth/login', { email: email.value, password: password.value })
    saveToken(data.token)
    window.location.href = '/dashboard'
  } catch (e) {
    error.value = 'Invalid email or password'
  }
}
</script>
