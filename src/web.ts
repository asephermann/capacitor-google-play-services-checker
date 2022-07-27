import { WebPlugin } from '@capacitor/core';

import type { GooglePlayServicesCheckerPlugin } from './definitions';

export class GooglePlayServicesCheckerWeb extends WebPlugin implements GooglePlayServicesCheckerPlugin {

  check(): Promise<{ isAvailable: boolean; }> {
    throw new Error('Method not implemented.');
  }
  
}
