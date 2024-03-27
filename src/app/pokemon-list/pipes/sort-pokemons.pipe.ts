import { Pipe, PipeTransform } from '@angular/core';
import {Pokemon} from "../../data/types";

@Pipe({
  name: 'sortPokemons'
})
export class SortPokemonsPipe implements PipeTransform {

  transform(pokemonList: Pokemon[], queryString: string): Pokemon[] {
    if(queryString === 'name') {
    pokemonList.sort((a, b) => a.name.localeCompare(b.name));

    }
    if( queryString === 'id') {
      return pokemonList.sort((a, b) => a.id - b.id);
    }
    return pokemonList;
    }

}
