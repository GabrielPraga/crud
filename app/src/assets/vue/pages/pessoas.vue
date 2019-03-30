<template>
  <f7-page>
    <f7-navbar title="Sobre" back-link="Back" sliding></f7-navbar>
    <f7-block-title>Lista de Pessoas</f7-block-title>
    <div class="list accordion-list">
      <ul>
        <li v-for="pessoa in pessoas" :key="pessoa.id" class="accordion-item">
          <a href="#" class="item-content item-link">
            <div class="item-inner">
              <div class="item-title">{{ pessoa.nome }}</div>
            </div>
          </a>
          <div class="accordion-item-content">
            <div class="block">
              <p>{{ pessoa.email }}</p>
            </div>
          </div>
        </li>
      </ul>
    </div>
  </f7-page>
</template>
<script>
 export default {
   computed: {
     pessoas(){
       return this.$store.getters.pessoas
     }
   },
   created (){
    this.$store.dispatch('loadPessoas')
  }
  };
</script>
