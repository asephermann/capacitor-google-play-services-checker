export interface GooglePlayServicesCheckerPlugin {
  check(options: CheckerOptions): Promise<void>;
}

export interface CheckerOptions {
  isAvailable: boolean;
}