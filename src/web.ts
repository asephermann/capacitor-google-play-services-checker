import { WebPlugin } from '@capacitor/core';

import type { GooglePlayServicesCheckerPlugin, CheckerOptions } from './definitions';

export class GooglePlayServicesCheckerWeb extends WebPlugin implements GooglePlayServicesCheckerPlugin {

  async check(result: CheckerOptions): Promise<void> {
    
    console.log('RESULT', result.isAvailable);
  }

}
