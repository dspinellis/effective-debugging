import logging;

logger = logging.getLogger('myapp')

# Send log messages to myapp.log
fh = logging.FileHandler('myapp.log')
logger.addHandler(fh)

logger.setLevel(logging.DEBUG)
logger.debug('In main module')
