import {Component, EventEmitter, Output} from '@angular/core';

@Component({
  selector: 'app-sort',
  templateUrl: './sort.component.html',
  styleUrl: './sort.component.css'
})
export class SortComponent {
  @Output() selectQuery = new EventEmitter<string>();
  selectedItem: string = "id";


  onValueChange(value: string) {
    this.selectQuery.emit(value);
    console.log(value);
  }
}
