export interface GooglePlayServicesCheckerPlugin {
  /**
 * Check if Google Play Services is available.
 *
 * 
 */
  check(): Promise<{ isAvailable: boolean }>;
}