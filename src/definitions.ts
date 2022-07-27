export interface GooglePlayServicesCheckerPlugin {
  /**
 * Check if Google Play Services is available.
 *
 * 
 */
  check(options: CheckerOptions): Promise<void>;
}

export interface CheckerOptions {
  /**
   * Google Play Services Availability check result.
  */
  isAvailable: boolean;
}