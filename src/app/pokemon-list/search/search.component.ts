import {Component, EventEmitter, Output} from '@angular/core';


@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrl: './search.component.css'
})
export class SearchComponent {
  @Output() searchQuery = new EventEmitter<string>();
  query : string = '';

  onValueChange(value: string) {
    this.searchQuery.emit(value);
  }
}
