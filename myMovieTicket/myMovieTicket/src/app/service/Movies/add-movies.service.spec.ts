import { TestBed } from '@angular/core/testing';

import { AddMoviesService } from './add-movies.service';

describe('AddMoviesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AddMoviesService = TestBed.get(AddMoviesService);
    expect(service).toBeTruthy();
  });
});
