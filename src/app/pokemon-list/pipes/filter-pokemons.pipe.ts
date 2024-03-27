import {Pipe, PipeTransform} from '@angular/core';
import {Pokemon} from "../../data/types";


@Pipe({
  name: 'filterPokemons'
})
export class FilterPokemonsPipe implements PipeTransform {

  transform(pokemonList: Pokemon[], queryString: string): Pokemon[] {
      return pokemonList.filter((pokemon) =>
        pokemon.name.toLowerCase().includes(queryString.toLowerCase()))

  }

}
