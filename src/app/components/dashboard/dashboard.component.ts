import { Component, OnInit,  } from '@angular/core';

const MAX_WIDTH_BREAKPOINT = 720;

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {

  private mediaMatcher: MediaQueryList = matchMedia(
    `(max-width : ${MAX_WIDTH_BREAKPOINT}px)`
  );
constructor() {}

  ngOnInit() {
  }

  isScreenSmall() {
    return this.mediaMatcher.matches;
  }

}
