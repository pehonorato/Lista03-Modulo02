// Criando os objetos de artistas/bandas
const artista1 = {
  nome: "The Beatles",
  anoLancamento: 1963,
  melhoresMusicas: ["Let It Be", "Hey Jude", "Help!"],
  integrantes: [
    {
      nomeCompleto: "John Lennon",
      paisOrigem: "Reino Unido",
      idade: 40
    },
    {
      nomeCompleto: "Paul McCartney",
      paisOrigem: "Reino Unido",
      idade: 79
    },
    {
      nomeCompleto: "George Harrison",
      paisOrigem: "Reino Unido",
      idade: 58
    },
    {
      nomeCompleto: "Ringo Starr",
      paisOrigem: "Reino Unido",
      idade: 81
    }
  ],
  estilo: "Rock"
};

const artista2 = {
  nome: "Queen",
  anoLancamento: 1973,
  melhoresMusicas: ["Bohemian Rhapsody", "We Will Rock You", "Under Pressure"],
  integrantes: [
    {
      nomeCompleto: "Freddie Mercury",
      paisOrigem: "Zanzibar",
      idade: 45
    },
    {
      nomeCompleto: "Brian May",
      paisOrigem: "Reino Unido",
      idade: 74
    },
    {
      nomeCompleto: "John Deacon",
      paisOrigem: "Reino Unido",
      idade: 70
    },
    {
      nomeCompleto: "Roger Taylor",
      paisOrigem: "Reino Unido",
      idade: 72
    }
  ],
  estilo: "Rock"
};

const artista3 = {
  nome: "Beyoncé",
  anoLancamento: 2003,
  melhoresMusicas: ["Crazy in Love", "Irreplaceable", "Single Ladies"],
  integrantes: [
    {
      nomeCompleto: "Beyoncé Knowles",
      paisOrigem: "Estados Unidos",
      idade: 40
    }
  ],
  estilo: "R&B"
};


const database = [];


database.push(artista1, artista2, artista3);


console.log("Lista de artistas/bandas:");
console.log(database);


database.sort(function(a, b) {
  if (a.nome < b.nome) {
    return -1;
  }
  if (a.nome > b.nome) {
    return 1;
  }
  return 0;
});


console.log("Lista de artistas/bandas ordenada por nome:");
console.log(database);


database.pop();


console.log("Lista de artistas/bandas após a remoção:");
console.log(database);
