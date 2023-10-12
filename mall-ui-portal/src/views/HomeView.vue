<script setup>
import Header from '@/components/Header.vue'
import Footer from "@/components/Footer.vue";
</script>

<template>
  <Header />
  <main class="container">
    <router-view  />
    <router-view name="part2" />
    <router-view name="part3" />
  </main>
  <Footer />
</template>
