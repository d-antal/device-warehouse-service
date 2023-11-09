package com.device.warehouse.service;

import java.util.List;

import com.device.warehouse.exception.DeviceNotFoundException;
import com.device.warehouse.model.Device;

public interface DeviceService {

	Device findDeviceById(Long deviceId) throws DeviceNotFoundException;

	Device addDevice(Device device);

	Device updateDevice(Long deviceId, Device device) throws DeviceNotFoundException;

	long removeDevice(Long deviceId) throws DeviceNotFoundException;

	List<Device> findAllActiveDevicesOrderedByPin();

}
