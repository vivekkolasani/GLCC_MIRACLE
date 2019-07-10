import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bar-chart',
  templateUrl: './bar-chart.component.html',
  styleUrls: ['./bar-chart.component.scss']
})
export class BarChartComponent implements OnInit {

  constructor() { }

  view: any[] = [600, 400];
  // options for the chart
  showXAxis = true;
  showYAxis = true;
  gradient = false;
  showLegend = true;
  showXAxisLabel = true;
  xAxisLabel = 'Cokes';
  showYAxisLabel = true;
  yAxisLabel = 'Sales';
  timeline = true;
  colorScheme = {
    domain: ['#9370DB', '#87CEFA', '#FA8072', '#FF7F50', '#90EE90', '#9370DB']
  };
  //pie
  showLabels = true;
  // data goes here
public single = [
  {
    "name": "China",
    "value": 2243772
  },
  {
    "name": "USA",
    "value": 1126000
  },
  {
    "name": "Norway",
    "value": 296215
  },
  {
    "name": "Japan",
    "value": 257363
  },
  {
    "name": "Germany",
    "value": 196750
  },
  {
    "name": "France",
    "value": 204617
  }
];
public multi = [
  {
    "name": "Coke",
    "series": [
      {
        "name": "2018",
        "value": 224
      },
      {
        "name": "2017",
        "value": 321
      }
    ]
  },
  {
    "name": "Diet Coke",
    "series": [
      {
        "name": "2018",
        "value": 112
      },
      {
        "name": "2017",
        "value": 464
      }
    ]
  },
  {
    "name": "Sprite",
    "series": [
      {
        "name": "2018",
        "value": 296
      },
      {
        "name": "2017",
        "value": 209
      }
    ]
  },
  {
    "name": "Dr.Pepper",
    "series": [
      {
        "name": "2018",
        "value": 257
      },
      {
        "name": "2017",
        "value": 205
      }
    ]
  },
  {
    "name": "Coke Zero",
    "series": [
      {
        "name": "2018",
        "value": 196
      },
      {
        "name": "2017",
        "value": 129
      }
    ]
  },
  {
    "name": "Coke Cherry",
    "series": [
      {
        "name": "2018",
        "value": 204
      },
      {
        "name": "2017",
        "value": 149
      }
    ]
  }
];

  ngOnInit() {
  }

}
