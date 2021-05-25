[CmdletBinding()]
param (
  [string]$AzModuleVersion = "5.9.0" # Current version cached on agents
)

. (Join-Path $PSScriptRoot Helpers PSModule-Helpers.ps1)

Install-ModuleIfNotInstalled "Az" $AzModuleVersion | Import-Module