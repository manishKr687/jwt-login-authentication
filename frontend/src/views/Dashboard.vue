<template>
  <div style="max-width:600px; margin:40px auto;">
    <h2>Dashboard (Protected)</h2>
    <p v-if="email">Logged in as: <b>{{ email }}</b></p>
    <p v-else>Fetching your profile...</p>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue'
import api from '../services/api.js'

const email = ref('')

onMounted(async () => {
  try {
    const { data } = await api.get('/auth/me')
    email.value = data.email
  } catch (e) {
    email.value = ''
  }
})
</script>
