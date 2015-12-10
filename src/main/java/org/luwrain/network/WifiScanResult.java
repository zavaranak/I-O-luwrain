/*
   Copyright 2012-2015 Michael Pozhidaev <michael.pozhidaev@gmail.com>

   This file is part of the LUWRAIN.

   LUWRAIN is free software; you can redistribute it and/or
   modify it under the terms of the GNU General Public
   License as published by the Free Software Foundation; either
   version 3 of the License, or (at your option) any later version.

   LUWRAIN is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   General Public License for more details.
*/

package org.luwrain.network;

import org.luwrain.core.NullCheck;

public class WifiScanResult
{
    public enum Type {OK, FAILED};

    private Type type;
    private WifiNetwork[] networks;

    WifiScanResult(Type type)
    {
	this.type = type;
	this.networks = new WifiNetwork[0];
    }

    WifiScanResult(Type type, WifiNetwork[] networks)
    {
	this.type = type;
	this.networks = networks;
	NullCheck.notNullItems(networks, "networks");
    }

    public Type type()
    {
	return type;
    }

    public WifiNetwork[] networks()
    {
	return networks;
    }
}