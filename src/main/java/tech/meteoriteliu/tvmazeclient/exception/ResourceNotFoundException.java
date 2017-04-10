package tech.meteoriteliu.tvmazeclient.exception;

import tech.meteoriteliu.tvmazeclient.Constants;

/**
 * Created by meteo on 2017/4/10.
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(int resourceType, String resourceId) {
        super(Constants.getResourceName(resourceType) + " (" + resourceId + ") not found in TVMaze");
    }
}
