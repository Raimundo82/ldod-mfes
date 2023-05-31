import { EventBus } from './event-bus';
import { Validator } from 'jsonschema';

declare global {
  const eventBus: EventBus;
  const validate: Validator;
}

export const getGlobal = function () {
  /* istanbul ignore next */
  if (typeof self !== 'undefined') {
    return self;
  }
  /* istanbul ignore next */
  if (typeof window !== 'undefined') {
    return window;
  }
  /* istanbul ignore next */
  if (typeof global !== 'undefined') {
    return global;
  }
  /* istanbul ignore next */
  throw new Error('unable to locate global object');
};

(getGlobal() as any).eventBus = new EventBus();
(getGlobal() as any).validate = new Validator();

export { EventBus, Validator };
