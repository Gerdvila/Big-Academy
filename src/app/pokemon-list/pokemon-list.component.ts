import {Component, inject, OnInit} from '@angular/core';
import {Store} from "@ngrx/store";
import {loadPokemons} from "../store/actions/pokemon.actions";
import {selectAllPokemons} from "../store/selectors/pokemon.selectors";



@Component({
  selector: 'app-pokemon-list',
  templateUrl: './pokemon-list.component.html',
  styleUrl: './pokemon-list.component.css'
})
export class PokemonListComponent implements OnInit{
  store = inject(Store);
  query: string = '';
  sortQuery: string = '';

  pokemons = this.store.selectSignal(selectAllPokemons);
  // pokemons = this.store.selectSignal(selectAllPokemons);

  ngOnInit() {
    this.store.dispatch(loadPokemons());
  }

  setFilter(value: string) {
      this.query = value;
  }

  setSort(value: string) {
    this.sortQuery = value;
  }

}
