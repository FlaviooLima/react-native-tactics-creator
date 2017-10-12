'use strict'

import React, { Component, PropTypes } from 'react'
import { View, requireNativeComponent } from 'react-native'

var face = {
    name: 'TacticalCreator',
    propTypes: {
    	...View.propTypes
    }
}

module.exports = requireNativeComponent('TacticalCreator', face);
