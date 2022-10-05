

# ModelImport

Import model object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourceId** | **String** | The resource identifier returned from the POST to /resources. Resource referred to must be a valid CSV, XML, or JSON file. |  |
|**importType** | **String** | This defines the resource that will be created through this import process.   *&#39;contact&#39;* is the only supported *importType* at this stage. |  |
|**importOptions** | [**FieldMapping**](FieldMapping.md) |  |  |
|**importMode** | [**ImportModeEnum**](#ImportModeEnum) | The type of contact import that is occurring. |  |



## Enum: ImportModeEnum

| Name | Value |
|---- | -----|
| REPLACE | &quot;replace&quot; |
| DUPLICATE | &quot;duplicate&quot; |
| IGNORE | &quot;ignore&quot; |



