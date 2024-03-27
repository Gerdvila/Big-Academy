import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PokemonListComponent } from './pokemon-list/pokemon-list.component';
import { CardComponent } from './pokemon-list/card/card.component';
import { StoreModule } from '@ngrx/store';
import {EffectsModule} from "@ngrx/effects";
import {PokemonEffects} from "./store/effects/pokemon.effects";
import {HttpClientModule} from "@angular/common/http";
import {appReducer, pokemonFeatureKey} from "./store/reducers";
import {TypeElementColorPipe} from "./pokemon-list/card/pipes/type-element-color.pipe";
import {PokemonNumberPipe} from "./pokemon-list/card/pipes/pokemon-number.pipe";
import { SearchComponent } from './pokemon-list/search/search.component';
import {FormsModule} from "@angular/forms";
import { FilterPokemonsPipe } from './pokemon-list/pipes/filter-pokemons.pipe';
import { SortComponent } from './pokemon-list/sort/sort.component';
import { SortPokemonsPipe } from './pokemon-list/pipes/sort-pokemons.pipe';

@NgModule({
  declarations: [
    AppComponent,
    PokemonListComponent,
    CardComponent,
    TypeElementColorPipe,
    PokemonNumberPipe,
    SearchComponent,
    FilterPokemonsPipe,
    SortComponent,
    SortPokemonsPipe,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    StoreModule.forRoot({}, {}),
    EffectsModule.forRoot([]),
    StoreModule.forFeature(pokemonFeatureKey, appReducer),
    EffectsModule.forFeature([PokemonEffects]),
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
