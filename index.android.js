'use strict'

import React, { Component, PropTypes } from 'react'
import { View, requireNativeComponent } from 'react-native'

var iface = {
    name: 'TacticalCreator',
    propTypes: {
    	...View.propTypes
    }
}

module.exports = requireNativeComponent('TacticalCreator', iface);
