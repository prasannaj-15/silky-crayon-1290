package com.easytrip.app.Service;

import java.util.List;

import com.easytrip.app.Exception.AdminException;
import com.easytrip.app.Exception.RouteException;
import com.easytrip.app.Model.Route;

public interface RouteService {
	public Route addRoute(Route route, String key) throws RouteException, AdminException;
	public List<Route> viewRoute(String key) throws RouteException, AdminException;
	public Route updateBus(Route route, String key) throws RouteException, AdminException;
	public Route removeRoute(Integer routeId, String key) throws RouteException, AdminException;
	public Route searchRoute(Integer routeId, String key) throws RouteException,AdminException;

	
}
