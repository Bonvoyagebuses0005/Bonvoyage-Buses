import { Component, OnInit } from '@angular/core';
import * as $ from 'jquery'


@Component({
  selector: 'app-searchbus',
  templateUrl: './searchbus.component.html',
  styleUrls: ['./searchbus.component.css']
})
export class SearchbusComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    $(document).ready(function() {
      $('input[type="radio"]').click(function() {
          if($(this).attr('id') == 'yes') {
               $('#show-me').show();           
          }
          else {
               $('#show-me').hide();   
          }
      });
   });

  }

}
